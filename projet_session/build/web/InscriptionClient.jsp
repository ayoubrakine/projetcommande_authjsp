<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="style.css">
        <script src="https://cdn.tailwindcss.com"></script>

       
    </head>
    <body class="bg-sky-100">

        <section class="bg-sky-100 flex justify-center pt-16 py-16   self-center"> 
            <!-- login container -->
            <div class="bg-gray-100  rounded-2xl shadow-2xl  pr-16 pl-16  flex items-center  justify-center p-5">
                <!-- form -->
                <div class="">
                    <h2 class="font-bold text-2xl text-[#002D74] flex items-center justify-center w-full pb-16">Inscription</h2>
           

                    <form action="InscriptionClientController" class="flex flex-col gap-4">
                        
                      
                        <input class="p-2 mt-4 rounded-xl border  " placeholder="Nom"  type="text" name="nom" value="" required/>

                        <input class="p-2 mt-4 rounded-xl border" placeholder="Prenom" type="text" name="prenom" value="" required/>
                        
                        <label class="font-bold mt-4 flex items-center justify-center ">Date de naisssance  :</label>
                        
                        <input class="p-2 mt rounded-xl border" placeholder="Date de naissance" type="date" name="dateNaisssance" value="" required/>

                       <input class="p-2 mt-4 rounded-xl border" placeholder="Email" type="email" name="email" value="" required/>

                        <input class="p-2 mt-4 rounded-xl border" placeholder="Password" type="password" name="password" value="" required/>


                        

                       
                        <input type="submit" value="S'inscrire" name="inscrireclient" class="text-sm text-white  px-3 py-1 md:mt-8  border-2 border-sky-400 rounded-xl text-white bg-[#002D74] hover:text-sky-500 hover:border-sky-500 hover:bg-white hover:border-2 py-2 hover:scale-105 duration-300" />

                    </form>


                    <div class="  py-2 w-full rounded-xl mt-5 flex ">
                        
            

                    </div>

                   

                   
                </div>

               
            </div>
       
</section>
    </body>
</html>
