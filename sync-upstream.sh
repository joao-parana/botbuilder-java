echo "Fiz anteriormente: git remote add upstream git@github.com:microsoft/botbuilder-java.git"
git fetch upstream
git checkout master 
git merge upstream/master
echo "Repositorio sincronizado com upstream"
echo "Agora você deve testar, adicionar, commitar e faça push"
git status

