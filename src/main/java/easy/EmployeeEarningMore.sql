/* https://leetcode.com/problems/employees-earning-more-than-their-managers */
SELECT em.name AS Employee FROM employee em WHERE  em.salary > (SELECT manager.salary FROM employee manager where em.managerId = manager.id);