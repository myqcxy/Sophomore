import turtle
def drawSnake(rad,angle,len,neckrad):
  for i in range(len):
    turtle.circle(rad,angle)
    turtle.circle(-rad,angle)
  turtle.circle(rad,angle/2)
  turtle.fd(rad)
  turtle.circle(neckrad+1,180)
  turtle.fd(rad*2/3)
def main():
  turtle.setup(1300,800,20,20)
  pythonsize = 60
  turtle.pensize(pythonsize)
  turtle.pencolor("orange")
  turtle.seth(0)
  drawSnake(40,80,5,pythonsize/2)
main()