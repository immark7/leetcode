using System;
using System.Collections.Generic;

namespace BaseballGame;

public class Game
{
    public int CalPoints(string[] operations)
    {
        List<int> list = new List<int>();

        foreach (var val in operations)
        {
            switch (val)
            {
                case "+":
                    list.Add(list[list.Count - 1] + list[list.Count - 2]);
                    break;
                case "D":
                    list.Add(list[list.Count - 1] * 2);
                    break;
                case "C":
                    list.RemoveAt(list.Count - 1);
                    break;
                default:
                    list.Add(int.Parse(val));
                    break;
            }
        }



        return list.Sum();
    }
}