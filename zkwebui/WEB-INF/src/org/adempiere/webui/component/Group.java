package org.adempiere.webui.component;

import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.UiException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zul.Div;
import org.zkoss.zul.Image;
import org.zkoss.zul.Label;
import org.zkoss.zul.Row;

public class Group extends org.zkoss.zul.Group {

	/**
	 * 
	 */
	private static final long serialVersionUID = -357795690637457751L;
	
	public static final String GROUP_ROW_VISIBLE_KEY = "groupRowVisible";

	public Group() {
		super();
		setSclass("z-group");
	}
	
	public Group(String label) {
		super(label);
		setSclass("z-group");
	}
	
	public <T> Group(String label, T value) {
		super(label, value);
		setSclass("z-group");
	}

	public String getLabel() {
		final Component cell = getFirstChild();
		return cell != null && cell instanceof GroupHeader ? ((GroupHeader)cell).getTitle() : null;
	}

	public void setLabel(String label) {
		autoFirstCell().setTitle(label);
	}	
	
	private GroupHeader autoFirstCell() {
		Component cell = getFirstChild();
		if (cell == null || cell instanceof GroupHeader) {
			if (cell == null) cell = new GroupHeader();
			cell.applyProperties();
			cell.setParent(this);
			return (GroupHeader)cell;
		}
		throw new UiException("Unsupported child for setLabel: "+cell);
	}
	
	public void setOpen(boolean open) {
		super.setOpen(open);
		autoFirstCell().setOpen(open);
		
		if(getParent() != null)
		{
			List<Row> rows = getItems();
			for (Row row : rows)
			{
				boolean visible = true;
				String value = (String) row.getAttribute(GROUP_ROW_VISIBLE_KEY);
				if (value != null)
					visible = value.equals("true");				
				row.setVisible(open && visible);
			}
		}
	}
	
	public class GroupHeader extends Div implements EventListener<Event>
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = -4070011056533999557L;
		private Image img;
		private Label lbl;
		
		private String title;
		private boolean isOpen;
		
		public GroupHeader()
		{
			super();
			init();
			setTitle(null);
			setOpen(true);
		}
		
		private void init()
		{
			setSclass("z-group-cnt");
			
			img = new Image();
			appendChild(img);
			img.addEventListener(Events.ON_CLICK, this);
			
			lbl = new Label();
			appendChild(lbl);
		}
		
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
			lbl.setValue(this.title);
		}

		public boolean isOpen() {
			return isOpen;
		}

		public void setOpen(boolean isOpen) {
			this.isOpen = isOpen;
			img.setSclass(this.isOpen ? "z-group-img-open" : "z-group-img-close");
		}

		@Override
		public void onEvent(Event e) throws Exception 
		{
			if (e.getName().equals(Events.ON_CLICK))
			{
				if (e.getTarget() == img)
				{
					((Group) getParent()).setOpen(!isOpen());
				}
			}
		}
	}
}