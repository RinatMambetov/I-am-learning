#include <stdio.h>

void main(void)
{
	const float litre_in_gallon = 3.785;
	const float km_in_mile = 1.609;
	float dist_per_miles;
	float gas_per_gallons;

	printf("enter dist per miles:\n");
	scanf("%f", &dist_per_miles);
	printf("enter gas per gallons:\n");
	scanf("%f", &gas_per_gallons);

	float dist_per_km = dist_per_miles * km_in_mile;
	float gas_per_litres = gas_per_gallons * litre_in_gallon;
	
	printf("gallons by miles is: %.1f\n", gas_per_gallons / dist_per_miles);
	printf("km by litres is: %.1f\n", dist_per_km / gas_per_litres);
}
