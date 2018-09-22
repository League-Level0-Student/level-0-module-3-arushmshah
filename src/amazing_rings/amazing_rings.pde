void setup(){
    size(1000,1000);
}
int x = 0;
void draw(){
  x++;
  background(#868F90);
  noFill();
for(int i=10; i>0; i--){
ellipse(x*5,500,i*10,i*10);
}
for(int i=10; i>0; i--){
ellipse(1000-x*5,500,i*10,i*10);
}
}