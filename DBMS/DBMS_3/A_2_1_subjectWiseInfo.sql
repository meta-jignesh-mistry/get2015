-- Query To open library database
use LibraryInformationSystem;

-- subject wise information on number of books purchased
SELECT COUNT(S.subjectId) AS total_Purchased ,S.subjectId,S.subjectName FROM Subjects S,Books B,Title T
WHERE
T.titleId=B.titleId AND S.subjectId=T.subjectId GROUP BY S.subjectId;