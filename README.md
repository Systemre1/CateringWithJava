# CateringWithJava

![image](https://user-images.githubusercontent.com/80685689/131997361-e7818283-5449-4fa9-b40f-281fcaa84d9f.png)
> I created this class so that the output colors of the threads are beautiful. I have defined the color code of each as a string. I made it as a final for it not to be changed.
----

![image](https://user-images.githubusercontent.com/80685689/131997391-16c6c65d-970a-497e-9ffe-405ed088ab3d.png)
> I created the waiter class here. I created a house with the data of cakes, borek and drinks. Then I created the waiter constructor and gave the house as a parameter so that I can access the data as a reference.
----

![image](https://user-images.githubusercontent.com/80685689/131997420-414bff66-ff6f-40fe-8764-c621a9ca9b7f.png)
> I created the fillTray method for the waiter to do the work of filling the trays. Since the inside of the method is long, I will tell by dividing it a little. I had to create conditions for the trays. My first if checks if the borek tray is less than 0 or less than 5. And he checks if there are 0 or 1 borek left in the borek tray. Because if I didn't create this condition, there become an infinite loop. We put the number of borek between 0 and 5 on the tray. And we set the boreks to 0. Then we print green on the panel, how much borek the waiter put and how much borek he left. Then I write sleep to wait 5 seconds. I did the same thing in the two else if underneath, I just changed the variables, one for drinks and one for cake.
----

![image](https://user-images.githubusercontent.com/80685689/131997445-e80b1df0-643b-4401-a617-376abf6f8960.png)
> Again, I will only describe what is for the borek. In others, the codes are the same, only the variables are different, I don't want to extend the report unnecessarily. This condition is a borek in the tray and generally more than four borek. Or he looks at the tray for zero borek and generally more than five borek. If the conditions are met, it looks at my two conditions, whether a tray is zero or not. If there is one borek in the tray, it subtracts four boreks from the borek. Prints information with Println. It makes the number of borek in the tray five. And sleeps for five seconds. If there is zero borek in the tray, it subtracts five from the borek. Prints the information to the panel. It makes the number of borek in the tray five. And sleeps for five seconds. The same is done in cakes and drinks.
----

![image](https://user-images.githubusercontent.com/80685689/131997474-0c450a8a-f7b1-45b7-a56e-c3d8780ca688.png)
> I'm throwing the running condition of my thread here. Call my fillTray method in the loop until I have zero cakes or zero borek or zero drinks at home.
----

![image](https://user-images.githubusercontent.com/80685689/131997503-45f9f682-bca3-42c2-8b51-ac52301a91aa.png)
> I created the guest class. I extended it to Thread. Here I also created a house for reference. The same figure I created a similar constructor here too. I created my variables to control how much the person eats. I created two variables to get what you do randomly and what you do randomly. Then I created the run of my thread. And I wanted the boreks or drinks or cakes or borekTray or cakeTray or drinkTray to be looped until there were no more. And I chose what to do randomly and made him call the method accordingly. At the end of While, I wrote on the panel how much and what guests ate.
----

![image](https://user-images.githubusercontent.com/80685689/131997523-d04fa574-b405-4cbf-b4da-6b397c6b8ad6.png)
> I created a dance and sleep method. I put the name of Sleep as sleep1 because I did not want to override the sleep method of thread. These two methods only write to the panel what the guest is doing. And then they wait for a period of up to five randomly.
----

![image](https://user-images.githubusercontent.com/80685689/131997548-8e16a3bb-a092-4a47-a2ad-730180e8623b.png)
----
![image](https://user-images.githubusercontent.com/80685689/131997563-76c71c18-2fee-477b-8c07-deff9af4b37b.png)
> I assign to whatEat to randomly determine what the guest eats. Then I create [if] for all those who have variables 0 (maxBoreks, maxCakes and maxDrinks) to have at least one eats from everything. If my first control is whatEat is zero and there is no zero borek in the tray and maxBoreks is zero, I decrease the number of boreks in the tray by one and increase the maxBoreks one. I print the name of the guest who eats. And I let it wait for a random time. I do the same with drinks and cakes. If max variables are different from zero, it goes to else. If the random count comes to zero and my maxBoreks is not five and there is no zero borek in the tray, it enters of if. It also reduces the number of boreks in the tray by one. It then increases the maxBoreks number by one. It then prints out the guest's name and what he ate. And it randomly holds it for a period of up to five. I did the same for cakes and drinks.
----

![image](https://user-images.githubusercontent.com/80685689/131997611-b186d91e-3836-455b-8cc9-83eede1bea0f.png)
> I created a home class. I created my Boreks, cakes and drinks variables. I wrote these five incomplete because you indicated that the trays will be filled first. Then I created my tray variables. I did Accesor and his mutators.
----

![image](https://user-images.githubusercontent.com/80685689/131997632-9ad7eb4d-2566-4743-a3c1-d1673c5e7436.png)
> Then I created a house, a waitress and ten guests in my main. I have set names for my guests to have names. Then I started my waiter. Then I started my ten guests. And my code is over.
----
