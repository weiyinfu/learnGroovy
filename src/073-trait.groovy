trait Shout {
    void shout() {
        println(this.name);
    }
}

class Dog implements Shout {
    var name = "dog"
}

class Cat implements Shout {
    var name = "cat"
}
d=new Dog()
c=new Cat()
d.shout()
c.shout()