#include <stdio.h>

int ft_iterative_factorial(int nb)
{
	int num;
	int result;
	result = 0;
	num = nb;
	
	if (nb < 0 || nb > 12)
		return(result);
	else 
	{
		result = 1;
		while(nb > 0)
		{
			result = nb * result;
			nb--;
		}
		printf("factorial of %d is %d",nb,result);
	}
	return(result);
	
}
int main(void)
{
	ft_iterative_factorial(3);
	return(0);
}