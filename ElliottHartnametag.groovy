import eu.mihosoft.vrl.v3d.CSG

println javafx.scene.text.Font.getFontNames() 

// To use the default Font is Arial at 30 point
CSG text = CSG.text("Elliott",5)

CSG rotatedText = text.rotz(90)

double distanceyCenter = rotatedText.getCenterY()

println "Center of world "+distanceyCenter

CSG centeredText = rotatedText.movey(-distanceyCenter)


double width = 30
double depth = 70
double height = 3
double widthOfText = centeredText.getTotalY()+10

double scale = depth/widthOfText

CSG scaleText = centeredText.scaley(scale)

double distanceInX = scaleText.getCenterX()
CSG textCenteredInX = scaleText.movex(-distanceInX)


println "total text width is"+widthOfText

println "scale for the text"+scale

println "width is "+width

println "depth is "+depth

println "height is "+height


CSG nameTagBase = new Cube(width,depth,height).toCSG()

return [nameTagBase,textCenteredInX]