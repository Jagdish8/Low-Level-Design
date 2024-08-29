class StackOverflow {
    public static void main(String[] args) {

        /*
        Requirements
            Users can post questions, answer questions, and comment on questions and answers.
            Users can vote on questions and answers.
            Questions should have tags associated with them.
            The system should assign reputation score to users based on their activity and the quality of their contributions.
            The system should handle concurrent access and ensure data consistency.

         Solution

            objects -> User, Question, Answer, Comment, Vote, Tag

            database tables:
                user :  id pk
                        name
                        email
                        reputation

                question :  id pk
                            user_id ( fk user.id)
                            label
                            content
                            question
                            reputation

                tag :   id pk
                        name

                // for many to many relationship we do this
                questions_tabs : pk (questions_id (fk question.id), tag_id (fk tag.id))

                answer   :  id pk
                            question_id(fk answer.id)
                            user_id(fk answer.id)
                            reputation

                vote : id pk
                       vote_type -> (QUESTION, ANSWER, COMMENT)
                       voter_id (fk user.id)
                       target_id -> Could be question_id, answer_id or comment_id
                       is_up_vote -> true or false
                       UNIQUE (voter_id, target_id) -- so that user can vote only once

                       there can be conditional constraints for fk for target)id

                comment : id pk
                          user_id (fk user.id)
                          parent_id -> Could be question_id, answer_id or comment_id
                          content
                          reputation

                The system should handle concurrent access and ensure data consistency.
                cdn, cache
                more of theory


         */
    }
}