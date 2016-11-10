package matrix.controller;

import matrix.model.MatrixModel;
import matrix.view.*;

public class MatrixController {
	
	private String[] words = {"we","are","number","one"};
	private MatrixModel [] models;
	private int [] numbers;
	
	public MatrixController()
	{
		showHipsterLevelThree();
		models = new MatrixModel [5];
		HipsterFrame appFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		for (int currentInt : numbers)
		{
			System.out.println(currentInt);
		}
		
		for (MatrixModel currentHipster : models)
		{
			System.out.println(currentHipster);
		}
		
		for(int index = 0; index < models.length; index++)
		{
			models[index] = new MatrixModel("Hipster #" + index);
			
		}
	}
	
	private void showHipsterLevelThree()
	{
		numbers = new int [] {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
		
		for(MatrixModel current : models)
		{
			System.out.println(current);
		}
	}
	
	public String[] getWords()
	{
		return words;
	}
	
	public MatrixModel[] getModels()
	{
		return models;
	}
	
	public int[] getNumbers()
	{
		return numbers;
	}
}