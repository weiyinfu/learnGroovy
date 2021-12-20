import groovy.text.SimpleTemplateEngine

name = "haha"
println "my name is ${name}"
x = 3
y = 4
println("${x}+${y}=${x + y}")
println("$x+$y=${x + y}")//不带大括号也是可以的

println("========")
def text = '''This Tutorial focuses on $TutorialName. In this tutorial you will learn 

about $Topic '''

def binding = ["TutorialName": "Groovy", "Topic": "Templates"]
def engine = new SimpleTemplateEngine()
def template = engine.createTemplate(text).make(binding)

println template