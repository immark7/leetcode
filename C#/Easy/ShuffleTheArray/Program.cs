namespace ShuffleTheArray
{
    public class Program
    {
        public static void Main()
        {
            Solution solution = new Solution();
            int[] nums = { 2, 5, 1, 3, 4, 7 };
            int n = nums.Length / 2;
            int[] shuffledArray = solution.Shuffle(nums, n);

            Console.WriteLine("Shuffled Array:");
            foreach (int element in shuffledArray)
            {
                Console.Write(element + " ");
            }
        }
    }
}