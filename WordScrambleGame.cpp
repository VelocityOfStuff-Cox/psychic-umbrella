/*
* Program          - Word Scramble Game
* Date             - April 18th 2024
* Programmer       - VelocityOfStuff
* Default Key Word - Daily
* Development Time - Few Hours
* Version          - 1.0
*/

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using std::string, std::vector;

struct WordScramble{
	string keyWord;
	vector<char> lettersList;
	vector<string> goalWords;
	vector<string> correctGuesses;
};

bool gameEnd{ false };
int score{0};
string userInput{ "" };

void wordsSet(WordScramble& game);
void printGame(const WordScramble game);
void answerLogic(WordScramble& game);

int main()
{
	WordScramble game;
	wordsSet(game);
	
	while(!gameEnd)
	{
	    printGame(game);
	     if (game.correctGuesses.size() == game.goalWords.size())
	    {
	        gameEnd = true;
	    }
	    answerLogic(game);
	}

    std::cout << std::endl;
}

void wordsSet(WordScramble& game)
{
	game.keyWord = "daily";
	
	for (int i{0}; i < game.keyWord.size(); i++)
	{
	    game.lettersList.push_back(game.keyWord.at(i));
	}
	
	std::sort(game.lettersList.begin(),game.lettersList.end());
	
	game.goalWords.push_back("day");
	game.goalWords.push_back("lay");
	game.goalWords.push_back("lid");
	game.goalWords.push_back("lad");
	game.goalWords.push_back("ail");
	game.goalWords.push_back("aid");
	game.goalWords.push_back("laid");
	game.goalWords.push_back("lady");
	game.goalWords.push_back("dial");
	game.goalWords.push_back("idly");
	game.goalWords.push_back("yald");
	game.goalWords.push_back("idyl");
	game.goalWords.push_back(game.keyWord);
}

void printGame(const WordScramble game)
{
    
    std::cout << "Unscramble the letters to make English words with atleast 3 letters\n" 
    << score << std::endl;
    for (int i{0}; i < game.lettersList.size(); i ++)
    {
        std::cout << game.lettersList.at(i);
    }
    std::cout << std::endl;
    
    std::cout << "Correct guesses" << std::endl;
    for (int i{0}; i < game.correctGuesses.size(); i ++)
    {
        std::cout << game.correctGuesses.at(i) << ", ";
    }
    std::cout << std::endl;
}

void answerLogic(WordScramble& game)
{
    std::cin >> userInput;
	
	bool solved{false};
	
	for (int i{0}; i < game.correctGuesses.size(); i++)
	{
	    if(game.correctGuesses.at(i) == userInput)
    	{
            solved = true;
            break;
    	}
	}
	
    for (int i{0}; i < game.goalWords.size(); i++)
    {
        if(game.goalWords.at(i) == userInput && !solved)
    	{
            score++;
	        game.correctGuesses.push_back(userInput);
    	}
    }
}
