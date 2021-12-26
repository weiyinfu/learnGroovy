class Rectangle2 {
    int _width
    int _height

    def width(w) {
        println("set width " + w)
        _width = w
    }

    def height(h) {
        println("set height " + h)
        _height = h
    }
}

def Rect(closure) {
    rec = new Rectangle2()
    closure.delegate = rec
    closure()
}

Rect {
    width 5
    height 10
}