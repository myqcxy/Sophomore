template <class T> 
T maximum(T a,T b, T c)
{
	T max = a;
	if( b > max) max = b;
	if( c > max) max = c;
	return max;
}
