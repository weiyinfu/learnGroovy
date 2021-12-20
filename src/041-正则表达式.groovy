var x = ~  '[0-9]*'
for (i in ['1234', 'abcd']) {
    m = x.matcher("1234")
    printf("%s %s\n", i, m.find())
}
println('abc' ==~ x)//快速判断一个字符串是否满足一个Patter
println('Groovy' ==~ 'oo')