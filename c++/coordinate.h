//#include"coordinate.cpp"
class coordinate{
	public:
		coordinate(double,double);
		void setdate(double,double);
		double distanceToOrigin();
		double coordinate_x();
		double coordinate_y();
	private:
		double x;
		double y;
};

