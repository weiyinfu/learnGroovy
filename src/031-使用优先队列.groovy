a = new ArrayList<Integer>()
r = new Random()
for (i in 0..10) {
    a.add(r.nextInt(100))
}

def cp(ArrayList<Integer> a) {
    b = new ArrayList<Integer>()
    for (i in a) {
        b.add(i)
    }
    return b
}

def ArraySort(ArrayList<Integer> a) {
    a.sort()
}

def PrioritySort(ArrayList<Integer> a) {
    q = new PriorityQueue<Integer>()
    for (i in a) q.add(i)
    i = 0
    while (!q.isEmpty()) a[i++] = q.poll()
}

def main() {
    f = [
            'Array.sort'  : ArraySort,
            'PrioritySort': PrioritySort,
    ]
    for (i in f) {
        b = cp(a)
        i.value(b)
        printf("%s:%s", i.key, b)
    }
}
main()