#include <array>
#include <string>
#include <vector>

// Round down all provided student scores.
std::vector<int> round_down_scores(std::vector<double> student_scores) {
    int n = student_scores.size();
    std::vector<int> rounded_scores;
    for(int i = 0; i < n; i++){
        rounded_scores.emplace_back(static_cast<int>(student_scores[i]));
    }
    
    return rounded_scores;
}

// Count the number of failing students out of the group provided.
int count_failed_students(std::vector<int> student_scores) {
    // TODO: Implement count_failed_students
    int count = 0;
    for(int score: student_scores){
        count += (score <= 40) ? 1 : 0;
    }
    return count;
}

// Create a list of grade thresholds based on the provided highest grade.
std::array<int, 4> letter_grades(int highest_score) {
    std::array<int, 4> grades;
    int interval = (highest_score - 40) / 4;
    int start = 41;
    for(int i = 0; i < 4; i++){
        grades[i] = start;
        start += interval;
    }
    return grades;
}

// Organize the student's rank, name, and grade information in ascending order.
std::vector<std::string> student_ranking(
    std::vector<int> student_scores, std::vector<std::string> student_names) {
    // TODO: Implement student_ranking
    int n = student_scores.size();
    std::vector<std::string> ranking(n);
    for(int i = 0; i < n; i++){
        ranking[i] = std::to_string(i + 1) + ". " + student_names[i] + ": " + std::to_string(student_scores[i]);
    }
    return ranking;
}

// Create a string that contains the name of the first student to make a perfect
// score on the exam.
std::string perfect_score(std::vector<int> student_scores,
                          std::vector<std::string> student_names) {
    // TODO: Implement perfect_score
    int n = student_scores.size();
    std::string answer ="";
    for(int i = 0; i < n; i++){
        if(student_scores[i] == 100) {
            answer = student_names[i];
            break;
        }
        
    }
    return answer;
}
