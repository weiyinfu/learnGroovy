class Node {
    var name = "node"
}

Node node;
println(node?.name)
if (!node) {
    println("node is empty")
}
print(node?.name ?: '无名氏')