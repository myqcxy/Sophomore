#include"coordinate.h"
#include<math.h>
coordinate::coordinate(double a,double b)
{
	setdate(a,b);
}
void coordinate::setdate(double a, double b)
{
	x = a;
	y = b;
}
double coordinate::distanceToOrigin()
{
	return sqrt(x*x+y*y);
}
double  coordinate::coordinate_x()
{
	return x;
}
double  coordinate::coordinate_y()
{
	return y;
}

