String output = new File( basedir, "build.log" ).text;

assert output =~ "ansible-playbook -c local -i [^ ]*/hosts -e var=value [^ ]*/playbook.yml"
