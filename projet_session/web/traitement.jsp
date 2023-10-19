<%-- 
    Document   : traitement
    Created on : 11 oct. 2023, 00:24:42
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://cdn.tailwindcss.com"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
        <title>Reset password</title>
    </head>

    <body class="flex items-center justify-center h-screen bg-sky-100 ">
        <div class="max-w-md mx-auto p-4  shadow-md bg-gray-100 flex rounded-2xl shadow-2xl">
           

                <form action="TraitementController">
                    <div class="mt-4 p-2">
                        
                        <label class="font-bold flex items-center justify-center ">Veuillez saisir le code de validation reçu par e-mail</label>



                        <input class="ml-5 mr-12 p-2 mt-4 rounded-xl border" placeholder="code" type="number" name="code" value="" required/>



                        <input type="submit" value="valider" class=" text-sm text-white  px-3 py-1 md:mt-8  border-2 border-sky-400 rounded-xl text-white bg-[#002D74] hover:text-sky-500 hover:border-sky-500 hover:bg-white hover:border-2 py-2 hover:scale-105 duration-300" />


                    </div>

             
                    </div>
                    </div>
                </form>
            
        </div>
    </body>
</html>

