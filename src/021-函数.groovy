def sum(int x,int y=3){
    return x+y
}
int sum2(int x,int y=3){
    return x+y
}
def sum3(x,y){
    return x+y
}
printf("%d,%d,%d",sum(1),sum2(2),sum3(4,5))
println(sum3("one","two"))

//变参数
def sum(int ... a){
    return Arrays.stream(a).sum()
}
print(sum())