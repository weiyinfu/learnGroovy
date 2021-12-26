/*
groovy被称为Java世界中的Python，它的语法非常灵活，怎么写怎么对

 */
println("hello world")

s = 0
i = 0
while (i < 100) {
    s += i
    i += 1
}
println(s)

s = 0
for (i = 0; i < 100; i++) {
    s += i
}
println(s)

a = [1, 2, 3, 4]
for (i in a) {
    print(i + ',')
}
s = 0
for (i in 1..100) {
    s += i
}
println(s)


def employee = ["Ken": 21, "John": 25, "Sally": 22];

for (emp in employee) {
    println(emp.key + " " + emp.value);
}


a = ["one": 1, "two": "three"]
a.each { println(it.key + " : " + it.value) }

a.each { it -> { println(it.key + " : " + it.value) } }

4.times { println("天下大势为我所控") }