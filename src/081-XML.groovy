import groovy.xml.MarkupBuilder

def mB = new MarkupBuilder()

// Compose the builder
x=mB.collection(shelf: 'New Arrivals') {
    movie(title: 'Enemy Behind')
    type('War, Thriller')
    format('DVD')
    year('2003')
    rating('PG')
    stars(10)
    description('Talk about a US-Japan war')
}
println(x.getClass())