package question_bank;

import java.util.Scanner;
import java.security.SecureRandom;

public class QuestionBank {
	
	// Variables
	String[] questionBank = new String[5];
	int[] questionAnswers = new int[5];
	int randomQuestion;
	int correctAnswer;
	int firstQuestion = 0;
	int secondQuestion = 0;
	int thirdQuestion = 0;
	int fourthQuestion = 0;
	int fifthQustion = 0;
	
	// Methods
	// Create a method to simulate the questions
	public void simulateQuestion()
	{
		//Question arrays
		questionBank[0] =
				" Which is a special method of a class or structure in object-oriented programming that initializes an object?\n"
				+ " 1. Variable\n"
				+ " 2. Getter\n"
				+ " 3. Setter\n"
				+ " 4. Constructor\n";
		
		questionAnswers[0] = 4;
		
		questionBank[1] =
				" Which encapsulates the fields of a class by making them accessible only through its public methods and keep the values themselves private\n"
				+ " 1. Getter\n"
				+ " 2. Setter\n"
				+ " 3. Getter and Setter\n"
				+ " 4. Constructor\n";
		
		questionAnswers[1] = 3;
		
		questionBank[2] =
				" Which stores a fixed-size sequential collection of elements of the same type?\n"
				+ " 1. Variable\n"
				+ " 2. Array\n"
				+ " 3. Collection\n"
				+ " 4. Object\n";
		
		questionAnswers[2] = 2;
		
		questionBank[3] =
				" Which allows different methods to have the same name, but different signatures?\n"
				+ " 1. Overloading\n"
				+ " 2. Overriding\n"
				+ " 3. Object\n"
				+ " 4. It is not possible\n";
		
		questionAnswers[3] = 1;
		
		questionBank[4] =
				" Which is the appropriate way to use static method within your main?\n"
				+ " 1. It cannot be used\n"
				+ " 2. staticMethodName()\n"
				+ " 3. objectName.staticMethodName()\n"
				+ " 4. className.staticMethodName()\n";
		
		questionAnswers[4] = 4;
		// Create random questions
		for (int i = 0; i < 5; i++)
		{
			boolean isRepeated = false;
			do
			{
				SecureRandom randomQuestions = new SecureRandom();
				randomQuestion = randomQuestions.nextInt(5);
				if (randomQuestion == 0)
				{
					firstQuestion++;
					if(firstQuestion > 1)
					{
						isRepeated = true;
					}
					else
					{
						isRepeated = false;
					}
				}
				else if (randomQuestion == 1)
				{
					secondQuestion++;
					if(secondQuestion > 1)
					{
						isRepeated = true;
					}
					else
					{
						isRepeated = false;
					}
				}
				else if (randomQuestion == 2)
				{
					thirdQuestion++;
					if(thirdQuestion > 1)
					{
						isRepeated = true;
					}
					else
					{
						isRepeated = false;
					}
				}
				else if (randomQuestion == 3)
				{
					fourthQuestion++;
					if(fourthQuestion > 1)
					{
						isRepeated = true;
					}
					else
					{
						isRepeated = false;
					}
				}
				else
				{
					fifthQustion++;
					if(fifthQustion > 1)
					{
						isRepeated = true;
					}
					else
					{
						isRepeated = false;
					}
				}
			} while (isRepeated);
			
			System.out.print(questionBank[randomQuestion]);
			
			Scanner input = new Scanner(System.in);
	        System.out.print("\n Enter the answer: ");
	        int userInput = input.nextInt();
	        checkAnswer(userInput);
		}
	}
	// Create a method to check the answer
	public void checkAnswer(int userInput)
	{
		if (userInput == questionAnswers[randomQuestion])
		{
			boolean result = true;
			correctAnswer++;
			generateMessage(result);
		}
		else
		{
			boolean result = false;
			generateMessage(result);
		}
	}
	// Create a method to display a random message for the user
	public void generateMessage(boolean result)
	{
		SecureRandom randomObject = new SecureRandom();
		if (result == true)
		{
			switch (randomObject.nextInt(4))
			{
				case 0:
					System.out.print("\n Very good!\n\n");
					break;
				case 1:
					System.out.print("\n Excellent!\n\n");
					break;
				case 2:
					System.out.print("\n Keep up the good work!\n\n");
					break;
				case 3:
					System.out.print("\n Nice work!\n\n");
					break;
			}
		}
		else
		{
			switch (randomObject.nextInt(4))
			{
				case 0:
					System.out.print("\n No. Please try again.\n\n");
					break;
				case 1:
					System.out.print("\n Wrong. Try once more!\n\n");
					break;
				case 2:
					System.out.print("\n No. Don't give up!\n\n");
					break;
				case 3:
					System.out.print("\n No. Keep trying!\n\n");
					break;
			}
		}
	}
	// Create a method to interact with the user
	public void inputAnswer()
	{
		simulateQuestion();
		System.out.printf(" Correct answers: %d\n Wrong answers: %d\n Percentage of correct answers: %d%%", correctAnswer, 5-correctAnswer, correctAnswer*100/5);
	}
}
