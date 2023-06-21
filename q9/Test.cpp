#include <iostream>
#include "Solution.cpp"

using namespace std;

int main()
{
    string test = "    -3452this_is_a_test";
    Solution solution = Solution();
    cout << solution.myAtoi(test);
}