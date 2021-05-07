const passport = require('passport');
const LocalStrategy = require('passport-local').Strategy;
const User = require('../models/User');

passport.use(new LocalStrategy({
    usernameField: 'CC',
    passwordField: 'contrasena'
}, async (CC, contrasena, done) => {
    const user = await User.findOne({CC})
    if(!user){
        return done(null,false,{message:'No se encontró el usuario'});
    } else {
        const match = await user.matchPassword(contrasena);
        if(match){
            return done(null,user);
        } else {
            return done(null,false,{message:'Contraseña incorrecta'});
        }
    }
}));
passport.serializeUser((user,done) => {
    done(null, user.id);
});
passport.deserializeUser((id,done)=>{
    User.findById(id,(err,user) => {
        done(err,user);
    });
})