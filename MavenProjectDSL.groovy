job('My First DSL project'){
Description('My first DSL project created on ${new Date()}
SCM
{
git('https://github.com/AmitMaurya15893/Jenkins_Upgradev3.git','master')
}
steps
{
maven('Clean Package','maven-samples/single-module/pom.xml')
}
publishers
{
archiveartifacts '**/*.jar'
}
}