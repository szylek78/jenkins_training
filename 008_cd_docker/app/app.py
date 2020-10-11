from flask import Flask, render_template
import random, os

app = Flask(__name__)

# list of cat images
images = [
    "https://media1.tenor.com/images/9e565edb98cf81d6edbda776fdae21dc/tenor.gif?itemid=13432804",
    "https://static01.nyt.com/images/2018/06/24/magazine/24Well-1/24Well-1-jumbo.jpg?quality=90&auto=webp"
]

@app.route('/')
def index():
    url = random.choice(images)
    return render_template('index.html', url=url)

if __name__ == "__main__":
    app.run(host="0.0.0.0")
