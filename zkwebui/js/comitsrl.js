/**
 * 
 */
function setPosicionIntercalacion(ctrl, pos)
{
    if(ctrl.setSelectionRange)
    {
        ctrl.focus()
        ctrl.setSelectionRange(pos,pos)
    }
    else if (ctrl.createTextRange)
    {
        var range = ctrl.createTextRange()
        range.collapse(true)
        range.moveEnd('character', pos)
        range.moveStart('character', pos)
        range.select()
    }
}
  
function reemplazarPuntoPorComa(event)
{
    if(event.which==46)
    {
        var element = event.currentTarget
        var selectionStart= element.selectionStart
        var text = element.value
        text = text.slice(0, element.selectionStart) +','+ text.slice(element.selectionEnd)
        element.value = text
        setPosicionIntercalacion(element, selectionStart+1)
        event.preventDefault()
     }
}
