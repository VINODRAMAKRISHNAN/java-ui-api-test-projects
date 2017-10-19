Feature: Api Test1 
post api with multiple inputs and excute amd validate the against the input given in a table

Scenario Outline: Test Student Rest Api
Given I execute POST API with attributes <in-id>,<in-name>,<in-age>,<in-status>,<in-street>,<in-zip>  
Then The reult will be validated against <out-id>,<out-name>,<out-age>,<out-status>,<out-street>,<out-zip>
Examples: 
| in-id  | in-name   | in-age   | in-status   | in-street    | in-zip | out-id |out-name | out-age | out-status | out-street   | out-zip  |
| 1      | aaa1      | 11       | true        | st1          | 4000   | 1	   |aaa1      | 11      | true       | st1          | 4000    |
| 2      | aaa23     | 11       | true        | st2          | 5000   | 2	   |aaa2      | 11      | true       | st2          | 5000    |
| 3      | aaa3      | 11       | true        | st3          | 6000   | 3	   |aaa3      | 11      | true       | st3          | 6000    |
