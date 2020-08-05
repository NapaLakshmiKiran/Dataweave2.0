%dw 2.0
var ed ={name:"lakshmi", sal:"999999"}
fun userdata(ed) = {sal: ed.sal}
output application/json
---
{
	userdata: userdata(ed)
}