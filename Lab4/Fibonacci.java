class Fibonacci{
    public static void main(String[] args){
        System.out.printf("%d",ft_fibonacci(47));

    }
public static int ft_fibonacci(int index){
	if(index < 0)
		return(-1);
	if(index == 0)
		return(0);
	if(index == 1 || index == 2)
		return(1);
	return(ft_fibonacci(index - 1) + ft_fibonacci(index - 2));
    }
}
/*
Notes from today
Golden ratio can be used to calculate the next number in the fibonacci
sequence
*/