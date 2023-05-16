struct Solution;

impl Solution {
    pub fn encode(strs: Vec<String>) -> String {
        return strs
            .iter()
            .map(|word| format!("{}#{}", word.len(), word))
            .collect::<Vec<String>>()
            .join("");
    }
    pub fn decode(s: &str) -> Vec<String> {
        let mut res = Vec::new();
        //Keep track of current position in the string.
        let mut i = 0;

        while i < s.len() {
            let mut jump = i;
            while s.chars().nth(jump) != Some('#') {
                jump += 1;
            }
            let length = s[i..jump].parse::<usize>().unwrap();
            res.push(s[jump + 1..jump + 1 + length].to_string());
            i = jump + 1 + length;
        }

        res
    }
}

fn main() {
    dbg!(Solution::encode(vec![
        "eat".to_owned(),
        "tea".to_owned(),
        "tan".to_owned(),
        "ate".to_owned(),
        "nat".to_owned(),
        "asd3sdas".to_owned()
    ]));
    dbg!(Solution::decode("3#eat3#tea3#tan3#ate3#nat8#asd3sdas"));
}
