#include <stdio.h>
#include <string.h>

void	main(void)
{
	char	str_init[40];
	char	str_result[40];
	int		str_init_length;
	int		item;
	int		count1;
	int		count2;

	item = 0;
	count1 = 0;
	count2 = 0;
	printf("enter any string with points and exclamation marks (# for exit):\n");
	scanf("%[^\n]s", str_init);
	str_init_length = strlen(str_init);
	while(item < str_init_length)
	{
		if (str_init[item] == '#')
			break;
		else if (str_init[item] == '.')
		{
			str_result[item + count2] = '!';
			count1++;
		}
		else if (str_init[item] == '!')
		{
			str_result[item + count2] = str_init[item];
			str_result[item + count2 + 1] = '!';
			count2++;
		}
		else
			str_result[item + count2] = str_init[item];
		str_result[item + count2 + 1] = '\0';
		item++;
	}
	printf("%s, amount of replaces: %d\n", str_result, count1 + count2);
}
