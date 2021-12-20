import groovy.json.JsonBuilder
import groovy.json.JsonOutput
import groovy.json.JsonSlurper

a = ["one": 1, "two": "three"]
s = JsonOutput.toJson(a)
println(s)
x = new JsonSlurper()
ans = x.parseText(s)
println(ans)

b = new JsonBuilder()
root = b.Rectangle {
    width 10
    height 10
    Circle(//直接写JSON结构体
            Radius: 1,
            point: [1, 2]
    )
    dog b.Dog {
        name 'dog'
    }
    cat b.Cat {
        name 'cat'
    }
}
println(root.toString())