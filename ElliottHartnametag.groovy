// code here

import eu.mihosoft.vrl.v3d.*;
import javafx.scene.text.Font;

Font font = new Font("Arial",  30);

CSG text = CSG.unionAll(
	TextExtrude.text((double)2,"Elliott",font).collect{
		it.rotx(180)
		.toZMin()
	}
)
	


double width = 30
double depth = 70
double height = 3

println "width is "+width

println "depth is "+depth

println "height is "+height


CSG nameTagBase = new Cube(width,depth,height).toCSG()

return [nameTagBase,text]