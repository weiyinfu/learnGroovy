def x = 1.23

def result = ""

switch (x) {

    case "foo": result = "found foo"

        // lets fall through

    case "bar": result += "bar"

    case [4, 5, 6, 'inList']: result = "list"

        break

    case 12..30: result = "range"

        break

    case Integer: result = "integer"

        break

    case Number: result = "number"

        break

    case { it > 3 }: result = "number > 3"

        break

    default: result = "default"

}