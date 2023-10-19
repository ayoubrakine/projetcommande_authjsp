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
<body>
  <section class="bg-sky-100 min-h-screen flex items-center justify-center">
  <!-- login container -->
  <div class="bg-gray-100 flex rounded-2xl shadow-2xl max-w-3xl p-5 items-center">
    <!-- form -->
    <div class="md:w-1/2 px-8 md:px-16">
      <h2 class="font-bold text-2xl text-[#002D74]">Authentification</h2>
      <p class="text-xs mt-4 text-[#002D74]">Si vous êtes déjà membre, connectez-vous facilement</p>

      <form action="AuthentificationController" class="flex flex-col gap-4">
          <input class="p-2 mt-8 rounded-xl border" type="email" name="email" placeholder="Email" required>
       
        <div class="relative">
          <input class="p-2 rounded-xl border w-full" type="password" name="password" placeholder="Password" required>
          
        </div>
          <input type="submit" name="submit" value="Se connecter" class="text-sm text-white  px-3 py-1 md:mt-8  border-2 border-sky-400 rounded-xl text-white bg-[#002D74] hover:text-sky-500 hover:border-sky-500 hover:bg-white hover:border-2 py-2 hover:scale-105 duration-300" />
       
      </form>
    

      <div class="  py-2 w-full rounded-xl mt-5 flex ">
        <%
                        if (request.getParameter("msg") != null) {%>
                        <div class="col-span-3 flex justify-center text-red-500"><%= request.getParameter("msg")%></div>
                    <%}%>
    
      </div>

      <div class="mt-5 text-xs border-b border-[#002D74] py-4 text-[#002D74] ">
          <div class="hover:-translate-y-1 hover:font-bold duration-300">
              <a href="passoublie.jsp" class=" hover:text-sky-400 "><u>Mot de passe oublié</u></a>
          </div>
        
      </div>

      <div class="mt-3 text-xs flex justify-between items-center text-[#002D74]">
        <p>Créer un compte ?</p>
        
  
     <a href="Inscription.jsp" class="py-2 px-5 bg-white border rounded-xl hover:scale-110 duration-300">S'inscrire</a>
      </div>
    </div>

    <!-- image -->
    <div class="md:block hidden w-1/2">
        <img class="rounded-2xl" src="silas-schneider-6Iy8QtLv9Yw-unsplash.jpg">
    </div>
  </div>
</section>
    
</body>
</html>
