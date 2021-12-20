x = {
    println("hello")
}
x()

y = (m, n) -> {
    return m + n
}

println(y(3, 4))
z = (String m, int n) -> {

}

p = {
    String m, int n ->
        {
            printf("%s %d", m, n)
        }
}
p('x', 3)
