using System;

namespace BaseballGame
{
    public class Program
    {
        public static void Main()
        {   
            Game baseballGame = new Game();
            string[] input = { "5", "2", "C", "D", "+" };
            int result = baseballGame.CalPoints(input);
            Console.WriteLine("Result: " + result);
        }
    }
}