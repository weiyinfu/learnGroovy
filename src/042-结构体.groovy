import groovy.transform.PackageScope
import org.w3c.dom.css.Rect

class Rectangle {
    var width = 3//可以直接赋值
    int height//可以直接赋值
    @PackageScope
    int thick
}

r = new Rectangle()
printf("%d,%d\n", r.width, r.height)

assert r.getClass()== Rectangle