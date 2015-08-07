package demoforumgrp.MavenDemo;
public class RemoveDuplicateElementMain
{
	public static void main(String args[]){

	}
	public int[] removeDuplicateElement(int[] array)
	{	

		int totalLength=array.length;
		
		totalLength--;
		int length=totalLength-1;
	
		for(int i=0;i<length;)
		{

			if(array[i]==array[i+1])
			{
				for(int j=i;j<(length);j++)
				{
					array[j]=array[j+1];

				}
				array[totalLength]=0;
				totalLength--;
				length=totalLength;
			}
			
			else
			{
				i++;
			}
			
		}

		return array;
	}
}