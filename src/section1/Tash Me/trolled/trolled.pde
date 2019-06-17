PImage mustache;
  PImage friend;
void setup (){
friend = loadImage ("mustache.jpg");
  size(800, 600);
  friend.resize(width,height);
  mustache = loadImage ("picture.png");
  mustache.resize(250,250);
}

void draw (){
background (friend);  
image(mustache, 320,15);
}
