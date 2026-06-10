func groupAnagrams(strs []string) [][]string {
    m := make(map[string][]string)
    
    for _, str := range strs {
        // 1. ordena a palavra para usar como chave
        chars := []rune(str)
        sort.Slice(chars, func(i, j int) bool {
            return chars[i] < chars[j]
        })
        key := string(chars)
        
        // 2. adiciona a palavra original na lista da chave
        m[key] = append(m[key], str)
    }
    
    // 3. retorna todos os valores do map
    result := make([][]string, 0, len(m))
    for _, group := range m {
        result = append(result, group)
    }
    return result
}

/*
Synced seamlessly with LeetHub Pro
Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
*/