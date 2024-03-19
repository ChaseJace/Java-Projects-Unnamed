/**
public String drawTank(String ch) {
String display="";
int tankHeight=0, liter=0;
//adjust the tank height based on capacity as needed
if(capacity<=100) {
liter=10;
tankHeight = (int)capacity/liter;
}else if(capacity<=1000) {
liter=100;
tankHeight = (int)capacity/liter;
}else if(capacity<=10000){
liter=1000;
tankHeight = (int)capacity/1000;
}else {
liter=10000;
tankHeight = (int)capacity/10000;
} //end of if
//(indicator) points to the water level in the tank
String get="<-"+(level+"L");
//Draw the graphic
for (int i = tankHeight; i > 0; i--) {
//display in liter evenly as per desired height
display+=liter*i+"L|";
//Draw the specified character as water
if (i<=level/liter) { //explanation is at document
//filled the tank with the character and repeats it 20 times, plus the indicator
display+=ch.repeat(20)+"|"+get;
get=""; //resets the get variable so it won't repeat the indicator
}else {
display+="\t\t |"; //draw blank space
} //end of if
display+="\n"; //separate the character in each line to draw a tank-like object.
} //end of the loop
//creates a 0L indicator and a bottom part of the tank
display+=" 0L(_______________________)";
//draw a cover(top) portion of the tank, then concatenates the drawn graphics from a
loop
return " ^^^^^^^^^^^^^^^^^^^^^\n"+display;
 */