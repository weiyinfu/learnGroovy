/*
IntRange类是groovy特有的Class
* */
for (i in 1..5) {
    //闭区间
    print(i + ",")
}
println()
for (i in 1..<5) {
    print(i + ",")
}
println()
for (i in 'a'..'c') {
    print(i + ",")
}
println()
for (i in 5..1) {
    print(i + ",")
}
println()
a = 1..5
println(a.getClass())
