use std::collections::HashSet;

struct Solution;

impl Solution {
    pub fn longest_consecutive(nums: Vec<i32>) -> i32 {
        let nums_set: HashSet<i32> = nums.into_iter().collect();
        let mut longest = 0;
        for &num in &nums_set {
            //If start of a sequence.
            if !nums_set.contains(&(num - 1)) {
                let count = (num..).take_while(|x| nums_set.contains(x)).count();
                longest = longest.max(count);
            }
        }
        return longest as i32;
    }
}

fn main() {
    dbg!(Solution::longest_consecutive(vec![1, 2, 3]));
    dbg!(Solution::longest_consecutive(vec![1, 3, 4, 23, 2, 24, 222]));
}
